(defproject shouter "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/java.jdbc "0.3.6"]
                 [postgresql "9.1-901-1.jdbc4"]
                 [ring/ring-jetty-adapter "1.3.2"]
                 [compojure "1.3.4"]
                 [hiccup "1.0.5"]])
