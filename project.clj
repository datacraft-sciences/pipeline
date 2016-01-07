(defproject datacraft/pipeline "0.1.0-SNAPSHOT"
  :description "Data processing pipeline tools for Clojure"
  :dependencies [[org.clojure/clojure "1.8.0-RC4"]
                 [net.mikera/core.matrix "0.48.0"]
                 [org.clojure/test.check "0.9.0"]
                 [org.clojure/data.csv "0.1.3"]]
  
  :source-paths ["src/main/clj"]
  :test-paths ["src/test/clj"]
  
  :resource-paths ["resources"]
  
  :profiles {:dev {:dependencies [[net.mikera/cljunit "0.3.1"]]
                   :java-source-paths ["src/test/java"]}}


  :jvm-opts  ["-Xmx8g"])
