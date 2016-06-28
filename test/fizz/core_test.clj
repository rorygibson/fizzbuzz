(ns fizz.core-test
  (:require [clojure.test :refer :all]
            [fizz.core :refer :all]))


(deftest if-number-is-1-returns-1
  (is (= "1" (process 1))))


(deftest replaces-3s-with-fizz
  (is (= "Lucky" (process 3))))


(deftest replaces-5s-with-buzz
  (is (= "Buzz" (process 5))))


(deftest reads-a-seq
  (is (= "12" (process [1 2]))))


(deftest works-on-a-range
  (is (= "12" (process (range 1 3)))))


(deftest replaces-3-in-a-seq
  (is (= "12Lucky4" (process (range 1 5)))))


(deftest replaces-3-and-5
  (is (= "12Lucky4BuzzFizz7" (process (range 1 8)))))


(deftest replaces-3_5-with-FizzBuzz
  (is (= "14FizzBuzz" (process (range 14 16)))))


(deftest full-sequence-from-1-to-15
  (is (= "12Lucky4BuzzFizz78FizzBuzz11FizzLucky14FizzBuzz" (process (range 1 16)))))


(deftest string-replace-numbers-containing-3-with-lucky
  (is (= "Lucky" (process 3))))
