defmodule M do
  def hello do IO.puts("Hello, World!") end
  def hi do IO.gets("What's your name\n") end
  def hello2 do IO.puts("Hello, #{hi()}") end
end
