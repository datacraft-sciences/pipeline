(ns datacraft.pipeline.test_csv
  (:use [clojure.test])
  (:require [datacraft.pipeline.csv :as csv]
            [clojure.core.matrix :as m]
            [clojure.java.io :as io]))

(deftest test-iris
  (let [iris (csv/load-csv "iris.csv")]
    (is (= 150 (m/row-count (:dataset iris))))
    (is (= ["Sepal Length" "Sepal Width" "Petal Length" "Petal Width" "Species"] (:columns iris)))))

