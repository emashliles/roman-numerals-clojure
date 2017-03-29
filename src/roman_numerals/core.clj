(ns roman-numerals.core)

(defn convert
  "I convert arabic to roman numerals"
  [arabic]
  (cond 
    (= arabic 0) ""
    (= arabic 1) "I"
    (= arabic 2) "II"
    (= arabic 3) "III"
    (= arabic 4) "IV"
    (= arabic 5) "V"))
