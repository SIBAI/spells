package spells

import Spells._

class AnsiPrintTests extends UnitTestConfiguration {
  test(""""green".green should be(Green + "green" + Reset)""") {
    "green".green should be(Green + "green" + Reset)
  }

  test(""""green".yellow.red.green should be("green".green)""") {
    "green".yellow.red.green should be("green".green)
  }

  test("""styled("white") should be("white")""") {
    styled("white") should be("white")
    println("white")
  }

  test("""styled("green")(Green) should be("green".green)""") {
    styled("green")(Green) should be("green".green)
    println("green")(Green)
  }

  test("""styled("green".green) should be("green".green)""") {
    styled("green".green) should be("green".green)
    println("green".green)
  }

  test("""styled("green".magenta)(Green) should be("green".green)""") {
    styled("green".magenta)(Green) should be("green".green)
    println("green".magenta)(Green)
  }

  test("""styled("yellow".yellow + "green".green + "yellow".yellow)(Yellow) should be("yellow".yellow + "green".green + "yellow".yellow)""") {
    styled("yellow".yellow + "green".green + "yellow".yellow)(Yellow) should be("yellow".yellow + "green".green + "yellow".yellow)
    println("yellow".yellow + "green".green + "yellow".yellow)(Yellow)
  }

  test("""styled("yellow" + "green".green)(Yellow) should be("yellow".yellow + "green".green)""") {
    styled("yellow" + "green".green)(Yellow) should be("yellow".yellow + "green".green)
    println("yellow" + "green".green)(Yellow)
  }

  test("""styled("yellow".yellow + "green")(Green) should be("yellow".yellow + "green".green)""") {
    styled("yellow".yellow + "green")(Green) should be("yellow".yellow + "green".green)
    println("yellow".yellow + "green")(Green)
  }

  test("""styled("yellow" + "green".green + "yellow")(Yellow) should be("yellow".yellow + "green".green + "yellow".yellow)""") {
    styled("yellow" + "green".green + "yellow")(Yellow) should be("yellow".yellow + "green".green + "yellow".yellow)
    println("yellow" + "green".green + "yellow")(Yellow)
  }

  test("""styled("yellow".yellow + "green" + "yellow".yellow)(Green) should be("yellow".yellow + "green".green + "yellow".yellow)""") {
    styled("yellow".yellow + "green" + "yellow".yellow)(Green) should be("yellow".yellow + "green".green + "yellow".yellow)
    println("yellow".yellow + "green" + "yellow".yellow)(Green)
  }

  test("""styled("yellow" + "green".green + "yellow".yellow)(Yellow) should be(Yellow + "yellow" + Green + "green" + "yellow".yellow)""") {
    styled("yellow" + "green".green + "yellow".yellow)(Yellow) should be("yellow".yellow + "green".green + "yellow".yellow)
    println("yellow" + "green".green + "yellow".yellow)(Yellow)
  }

  test("""styled("yellow".yellow + "green".green + "yellow")(Yellow) should be("yellow".yellow + "green".green + "yellow".yellow)""") {
    styled("yellow".yellow + "green".green + "yellow")(Yellow) should be("yellow".yellow + "green".green + "yellow".yellow)
    println("yellow".yellow + "green".green + "yellow")(Yellow)
  }

  test("""styled("yellow" + "red".red + "yellow" + "green".green + "yellow")(Yellow) should be("yellow".yellow + "red".red + "yellow".yellow + "green".green + "yellow".yellow)""") {
    styled("yellow" + "red".red + "yellow" + "green".green + "yellow")(Yellow) should be("yellow".yellow + "red".red + "yellow".yellow + "green".green + "yellow".yellow)
    println("yellow" + "red".red + "yellow" + "green".green + "yellow")(Yellow)
  }

  test("""styled("yellow" + "red".red + "yellow" + "green".green + "yellow") with implicit DefaultStyle = Yellow should be("yellow".yellow + "red".red + "yellow".yellow + "green".green + "yellow".yellow)""") {
    implicit val DefaultStyle = Yellow
    styled("yellow" + "red".red + "yellow" + "green".green + "yellow") should be("yellow".yellow + "red".red + "yellow".yellow + "green".green + "yellow".yellow)
    println("yellow" + "red".red + "yellow" + "green".green + "yellow")
  }
}