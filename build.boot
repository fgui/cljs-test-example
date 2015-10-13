(set-env!
 :source-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.7.0"]
                 [adzerk/boot-test "1.0.4" :scope "test"]
                 [crisptrutski/boot-cljs-test "0.2.0-SNAPSHOT"]
                 ]
 )

(require '[adzerk.boot-test :refer :all])
(require '[crisptrutski.boot-cljs-test :refer [test-cljs]])

;; assumes slimerj installed http://slimerjs.org/
(task-options! test-cljs {:js-env :slimer})
