(defproject rest-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler rest-demo.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}}
  :repl-options {
    :prompt (fn [ns] (str "\u001B[35m[\u001B[34m" ns "\u001B[35m]\u001B[33m =>\u001B[m " ))
    :welcome (println "Its REPL time!")})
