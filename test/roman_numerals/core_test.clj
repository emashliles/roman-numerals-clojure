(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest converts-0
  (testing "Converts 0"
    (is (= "" (convert 0)))))

(deftest converts-1
  (testing "Convert 1"
    (is (= "I" (convert 1)))))

(deftest converts-2
  (testing "Converts 2"
    (is (= "II" (convert 2)))))
