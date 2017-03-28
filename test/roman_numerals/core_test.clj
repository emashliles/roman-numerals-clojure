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

(deftest converts-6
  (testing "Converts 6"
    (is (= "VI" (convert 6)))))

(deftest converts-9
  (testing "Converts 9"
    (is (= "IX" (convert 9)))))

(deftest converts-10
  (testing "Converts 10"
    (is (= "X" (convert 10)))))

(deftest converts-14
  (testing "Converts 14"
    (is (= "XIV" (convert 14)))))
