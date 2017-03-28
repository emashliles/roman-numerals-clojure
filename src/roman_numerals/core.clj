(ns roman-numerals.core)

(declare convert-numeral)

(defn convert [arabic]
 (convert-numeral arabic "") 
  )


(defn convert-numeral [arabic numeral]
  (cond (= arabic 0) numeral
        (<= arabic 3) (convert-numeral (- arabic 1) (str numeral "I"))
        (= arabic 4) (str numeral "IV")
        (= arabic 9) (str numeral "IX")
        (>= arabic 10) (convert-numeral (- arabic 10) (str numeral "X"))
        (>= arabic 5) (convert-numeral (- arabic 5) (str numeral "V"))
        ) 
  )
