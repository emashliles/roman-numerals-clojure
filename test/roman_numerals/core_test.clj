(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest converts-0
  (testing "Converts 0"
    (is (= "" (convert 0)))))

(deftest converts-1
  (testing "Converts 1"
    (is (= "I" (convert 1)))))

(deftest converts-2
  (testing "Converts 2"
    (is (= "II" (convert 2)))))

(deftest converts-3
  (testing "Converts 3"
    (is (= "III" (convert 3)))))

(deftest converts-4
  (testing "Converts 4"
    (is (= "IV" (convert 4)))))

(deftest converts-5
  (testing "Converts 5"
    (is (= "V" (convert 5)))))
