(ns datacraft.pipeline.csv
  (:require [clojure.data.csv :as csv]
            [clojure.core.matrix.dataset :as ds]
            [datacraft.pipeline.utils :as utils]))

(defn load-csv 
  "Loads a CSV file as a pipeline data object"
  ([source]
    (load-csv source nil))
  ([source options]
    (let [header (boolean (or (:header options) true))
          csv-data (with-open [in-file (utils/reader "iris.csv")]
                     (doall (csv/read-csv in-file)))
          row1 (first csv-data)
          cc (count row1)
          colnames (vec (if header row1 (map str (range cc))))
          row-data (vec (if header (next csv-data) csv-data))]
      {:dataset (ds/dataset colnames row-data)
       :columns colnames})))

