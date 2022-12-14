(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [n]
  (if (< n 0) (- n) n))

(defn divides? [divisor n]
  (if (== 0 (rem n divisor)) true false))

(defn fizzbuzz [n]
  (cond
    (== 0 (rem n 15)) "gotcha!"
    (== 0 (rem n 3)) "fizz"
    (== 0 (rem n 5)) "buzz"
    
    :else ""))

(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (if (= true (teen? age)) false true))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x)) 
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond 
    (not(== 0 (rem year 4))) false
    (and(== 0 (rem year 4)) (== 0 (rem year 100)) (== 0 (rem year 400))) true
    (and(== 0 (rem year 4)) (== 0 (rem year 100))) false
    :else true))
  


; '_______'
