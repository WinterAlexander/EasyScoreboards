#EasyScoreboards

A spigot ressource, link: https://www.spigotmc.org/resources/10823/


You want to include scoreboards in your plugin and you have troubles with the bukkit API ? Well this ressource have been made for you ! With this API, you can easily create any scoreboards in a fews lines of code and no flicking !

<img src="http://s30.postimg.org/661fj2001/easysc.png" alt="EasyScoreboards" />

You can make 2 types of scoreboards:

The unranked, perfect to write some texts and infos that aren't only integers. (Like an in-game ratio in our example)
The ranked, it is just a normal scoreboard, you need to specify a title (String) and an HashMap of String and Integer to give the score.

This API only update what need to be updated, if you recend datas equivalent to the previous ones or partly equivalent, it won't update the same datas to prevent clients lags and scoreboards irregularities.

Now supports scoreboard data sending with a premade scoreboard to permit use of teams or other objectives.
