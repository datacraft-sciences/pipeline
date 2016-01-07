(ns datacraft.pipeline.utils
  (:require [clojure.java.io :as io]))

(defn reader 
  "Gets a reader for the sepcified source. Source name be:
    - An existing reader
    - A File
    - A String representing a file resource on the classpath"
  ([source]
    (let [source (io/resource source)]
      (io/reader source))))

