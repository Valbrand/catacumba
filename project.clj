(defproject funcool/catacumba "2.0.0-SNAPSHOT"
  :description "Asynchronous Web Toolkit for Clojure."
  :url "http://github.com/funcool/catacumba"
  :license {:name "BSD (2-Clause)"
            :url "http://opensource.org/licenses/BSD-2-Clause"}

  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]

  :jar-exclusions [#"\.swp|\.swo|bench\.clj|user\.clj"]
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"
                  "-Xlint:unchecked" "-Xlint:deprecation"]
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.slf4j/slf4j-simple "1.7.23" :scope "provided"]
                 [org.clojure/core.async "0.3.441"]
                 [io.ratpack/ratpack-core "1.4.5"
                  :exclusions [io.netty/netty-codec-http
                               io.netty/netty-handler
                               io.netty/netty-transport-native-epoll
                               org.yaml/snakeyaml
                               com.fasterxml.jackson.core/jackson-core]]
                 [io.netty/netty-all "4.1.6.Final"]

                 [cheshire "5.7.0"]

                 ;; Updated & forced dependencies of jackson (form cheshire)
                 [com.fasterxml.jackson.core/jackson-core "2.8.7"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-cbor "2.8.7"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-smile "2.8.7"]

                 ;; Updated & forced dependencies of jackson (from ratpack
                 [com.fasterxml.jackson.core/jackson-databind "2.8.7"]
                 [com.fasterxml.jackson.core/jackson-annotations "2.8.7"]
                 [com.fasterxml.jackson.dataformat/jackson-dataformat-yaml "2.8.7"]
                 [com.fasterxml.jackson.datatype/jackson-datatype-guava "2.8.7"
                  :exclusions [[org.yaml/snakeyaml] [com.google.guava/guava]]]
                 [com.fasterxml.jackson.datatype/jackson-datatype-jdk8 "2.8.7"]
                 [com.fasterxml.jackson.datatype/jackson-datatype-jsr310 "2.8.7"]

                 [ns-tracker "0.3.1"]
                 [manifold "0.1.5"]
                 [commons-io/commons-io "2.5"]
                 [buddy/buddy-sign "1.4.0"]
                 [funcool/beicon "3.1.0"]
                 [funcool/cuerdas "2.0.3"]
                 [funcool/promesa "1.8.0"]
                 [danlentz/clj-uuid "0.1.7"]
                 [environ "1.1.0"]
                 [com.cognitect/transit-clj "0.8.297"]])
