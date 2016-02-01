(defproject datacraft/pipeline "0.1.0-SNAPSHOT"
  :description "Data processing pipeline tools for Clojure"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [net.mikera/core.matrix "0.49.0"]
                 [org.clojure/test.check "0.9.0"]
                 [org.clojure/data.csv "0.1.3"]
                 [prismatic/schema "1.0.4"]]
  
  :source-paths ["src/main/clj"]
  :test-paths ["src/test/clj"]
  
  :resource-paths ["src/test/resources"]
  
  :profiles {:dev {:dependencies [[net.mikera/cljunit "0.3.1"]]
                   :java-source-paths ["src/test/java"]}}


  :jvm-opts  ["-Xmx8g"])
