(ns roman-numerals.core)

(defn to-numerals [arabic numerals] 
  (cond (= arabic 0) numerals
        (<= arabic 3) (to-numerals (- arabic 1) (str numerals "I"))
        (= arabic 4)  (to-numerals (- arabic 4) (str numerals "IV"))
        (= arabic 9) (to-numerals (- arabic 9) (str numerals "IX"))
        (>= arabic 10) (to-numerals (- arabic 10) (str numerals "X"))
        (>= arabic 5) (to-numerals (- arabic 5) (str numerals "V"))))

(defn convert [arabic]
  (to-numerals arabic ""))
