(defproject monitoring "0.1.0-SNAPSHOT"
  :description "Sentinel Multi-Chain Monitoring"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [clj-http "3.12.3"]
                 [cheshire "5.11.0"]]
  :main ^:skip-aot monitoring.core  ;; <--- ВОТ ЭТА СТРОКА ДОЛЖНА БЫТЬ ТУТ
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
