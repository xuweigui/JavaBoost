# Summary
There are 2 assignments from IMC

## Task 1 Visitor
Under the package of com.imc.visitor

## Test 2. Paper Scissors Rock
Under the package of com.imc.game


# Getting Started
## Prerequisit
Install JDK 1.8 and Apache maven 3.6.0 or above

## build
`mvn clean install`

## how to run
* Use `ShapeVisitorDemo` to run task 1
* Use `GameDemo` to run task 2

# Task 2 design 
The `Game` consists of `Play`s. In each round of `Play` the user and computer show an `Action` that has a `Result` of `WIN`, `LOSE` or `TIE`;  

In each play a `PlayStrategy` is used to decide what to show in the next round, and the result is represented by `PlayResult`. Two Strategies are implemented following the strategy design pattern: 
* `RandomStrategy` 
* `UseOpponentsLastPlayWhenLostStrategy`

Within a game, a `GameStrategy` is used to manage the proforlio of the `PlayStrategy`. The factory design pattern (`GameStrategyFactory`) is used to generate the `GameStrategy`.
Refer to this strategy to add new one.
* `WeightBasedGameStrategy`


Visitor design pattern is used for `PlayStrategy`, `GameStrategy` and the `GameResult` to react to the `PlayResult`. Following are some example of the adjustment
* `UseOpponentsLastPlayWhenLostStrategy` shows the opponents simbol in the next round 
* `DynamicWeightGameStrategy` (TBD) adjusts the weight of the current `PlayStrategy` based on the round is win or lose. 

