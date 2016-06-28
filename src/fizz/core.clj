(ns fizz.core
  (:require [clojure.string :refer [index-of]]))


(defn divisible-by [n d] (and (number? n) (= 0 (mod n d))))


(defn fizz [n]     (if (number-divisible-by n 3) "Fizz" n))
(defn buzz [n]     (if (number-divisible-by n 5) "Buzz" n))
(defn fizzbuzz [n] (if (and (number-divisible-by n 3) (number-divisible-by n 5)) "FizzBuzz" n))
(defn lucky [n]    (if (index-of (str n) "3") "Lucky" n))


(defn translate
  "Translate a sequence of numbers to a FizzBuzz/Lucky string (on one line)"
  [n]
  (some-> n fizzbuzz lucky fizz buzz))


(defn process
  [ns]
  (if (sequential? ns)
    (apply str (map translate ns))
    (str (translate ns))))
