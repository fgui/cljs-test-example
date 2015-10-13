(ns fgui.kata-test
  (:require [fgui.kata :as sut]
            #?(:clj [clojure.test :as t]
               :cljs [cljs.test :as t :include-macros true]))
  )

(t/deftest my-function-test
   (t/testing "simple test"
     (t/is (= 4 (sut/my-function 2 2)))
     (t/is (= 5 (sut/my-function 3 2)))))
