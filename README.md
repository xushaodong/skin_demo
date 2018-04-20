# skin_demo
使用skin-support库实现插件化换肤demo
------
1.demo简单的实现了普通的view，dialog和recycleview列表的换肤功能

2.项目里面包含了两套皮肤包：白天  夜间

### 附：换肤包的如何打包

1、因为每个皮肤包都是module，所以无法正常运行，所以就要用到Gradlew命令了，在Terminal中输入命令gradlew :module的名称:assembleDebug，这个命令是打Debug包的，当然也可以通过gradlew :module的名称:assembleRelease命令打 Release包。 

2.将皮肤包（APK包）改名为.skin包，放入src\main\assets\skins下面就可以了
