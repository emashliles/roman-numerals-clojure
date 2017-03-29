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

(deftest converts-7
  (testing "Converts 7"
    (is (= "VII" (convert 7)))))

(deftest converts-8
  (testing "Converts 8"
    (is (= "VIII" (convert 8)))))

(deftest converts-9
  (testing "Converts 9"
    (is (= "IX" (convert 9)))))

(deftest converts-10
  (testing "Converts 10"
    (is (= "X" (convert 10)))))

(deftest converts-11
  (testing "Converts 11"
    (is (= "XI" (convert 11)))))

(deftest converts-12
  (testing "Converts 12"
    (is (= "XII" (convert 12)))))

(deftest converts-13
  (testing "Converts 13"
    (is (= "XIII" (convert 13)))))

(deftest converts-14
  (testing "Converts 14"
    (is (= "XIV" (convert 14)))))

(deftest converts-15
  (testing "Converts 15"
    (is (= "XV" (convert 15)))))

(deftest converts-16
  (testing "Converts 16"
    (is (= "XVI" (convert 16)))))

(deftest converts-17
  (testing "Converts 17"
    (is (= "XVII" (convert 17)))))

(deftest converts-18
  (testing "Converts 18"
    (is (= "XVIII" (convert 18)))))
