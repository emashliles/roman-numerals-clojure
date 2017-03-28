(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest converts-0
  (testing "Converts 0"
    (is (= "" (convert 0)))))
