(defproject monitoring "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [clj-http "3.12.3"]
                 [cheshire "5.11.0"]]
  :main monitoring.core ;; <--- Добавьте или проверьте эту строку
  :repl-options {:init-ns monitoring.core}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
