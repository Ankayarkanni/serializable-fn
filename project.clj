(defproject yieldbot/serializable-fn "0.1.3"
  :url "http://github.com/sorenmacbeth/serializable-fn"
  :description "Serializable functions in Clojure"
  :min-lein-version "2.0.0"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :jvm-opts ^:replace ["-server" "-Xmx512m"]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [org.clojure/tools.logging "1.3.0"]
                 [com.esotericsoftware/kryo "5.6.1"]
                 [com.twitter/chill-java "0.10.0"]
                 [com.twitter/carbonite "1.5.0"]]
  :profiles {:dev
             {:dependencies [[ch.qos.logback/logback-classic "1.5.18"]
                             [criterium "0.4.6"]]}
             :provided
             {:dependencies [[ch.qos.logback/logback-classic "1.5.18"]]}})
