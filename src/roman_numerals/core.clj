(ns roman-numerals.core)

(defn convert
  "I convert arabic to roman numerals"
  [arabic]
  (cond
    (and (>= arabic 0) (<= arabic 3)) (clojure.string/join "" (repeat arabic "I"))
    (= arabic 4) "IV"
    (and (>= arabic 5) (<= arabic 8)) (str "V" (convert (- arabic 5)))
    (= arabic 9) "IX"
    (and (>= arabic 10) (<= arabic 18)) (str "X" (convert (- arabic 10)))
    ))
