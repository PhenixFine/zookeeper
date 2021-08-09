# zookeeper
Stage 4 of 4 for JetBrains Academy - Kotlin - [Zookeeper project](https://hyperskill.org/projects/196/stages/978/implement).   
This stage has us loop the previous stage until the user types `exit`. 
## Requirements
### Description
Now it's time to make our project user-friendly. In this final stage, you'll make your software ready for the zoo staff to use. Your program should understand the habitat numbers, show the animals, and be able to work continuously without having to be restarted.
### Objectives
Your tasks at this point:
1. Your program should repeat the behavior from the previous stage, but now in a loop.
2. Do not forget to include an exit opportunity: inputting `exit` should end the program.
3. When the program is done running, it should print: See you later!
### Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

The final version of the program should run like this:
#### Example 1
```text
Please enter the number of the habitat you would like to view: > 3

Switching on the camera in the goose habitat...

                                    _
                                ,-"" "".
                              ,'  ____  `.
                            ,'  ,'    `.  `._
   (`.         _..--.._   ,'  ,'        \    \
  (`-.\    .-""        ""'   /          (  d _b
 (`._  `-"" ,._             (            `-(   \
 <_  `     (  <`<            \              `-._\
  <`-       (__< <           :
   (__        (_<_<          ;
    `------------------------------------------
The goose is staring intently at you... Maybe it's time to change the channel?
Please enter the number of the habitat you would like to view: > 1

Switching on the camera in the lion habitat...
                                               ,w.
                                             ,YWMMw  ,M  ,
                        _.---.._   __..---._.'MMMMMw,wMWmW,
                   _.-""        '''           YP"WMMMMMMMMMb,
                .-' __.'                   .'     MMMMW^WMMMM;
    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
 ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\
,MM:.    .'.-'   .'     ;     `\    ;     `,     MMMMMMMW `"=./`-,
WMMm__,-'.'     /      _.\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
"^MP__.-'    ,-' _.--""   `-,   ;       \  ; ;MMMMMMMMMMW^``; __|
           /   .'            ; ;         )  )`{  \ `"^W^`,   \  :
          /  .'             /  (       .'  /     Ww._     `.  `"
         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
        (--, )                `,_ / `) \/"")      ^"      `-, -;"\:
The lion is roaring!
Please enter the number of the habitat you would like to view: > exit
See you later!
```
