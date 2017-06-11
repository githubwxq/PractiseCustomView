<h1 align="center">ViewSupport</h1>

<p align="center">
<a href="https://www.apache.org/licenses/LICENSE-2.0"> <img src="https://img.shields.io/badge/license-Apache%202-green.svg" /></a>
<a href="#"> <img src="https://img.shields.io/badge/Support-9%2B-green.svg" /></a>
<a href="https://jitpack.io/#GcsSloop/ViewSupport"> <img src="https://jitpack.io/v/GcsSloop/ViewSupport.svg" /></a>
</p>

![](https://raw.githubusercontent.com/GcsSloop/ViewSupport/res/img/ViewSupport.png)

该开源库的主要作用就是简化自定义View过程中的一些流程，让自定义View更简单，更方便，更高效，例如：

* 继承 `CustomView` 以自动获取 View 大小以及默认画笔。
* 使用 `CanvasAidUtils` 绘制当前坐标系以检查绘制的位置。
* 使用 `MathUtils` 方便的进行角度弧度转换，计算距离。

除此之外，它还有更多的工具和辅助类来帮助你更方便的自定义View，更多信息请查看下面表格。

如果你对此有什么比较好的建议，欢迎提交 Issues 来告诉我。

对自定义View感兴趣的欢迎来 [我的博客](http://www.gcssloop.com/#blog) 查看相关文章。

*****

## 工具列表

>
>**PS: 点击工具名称查看源码，点击Wiki查看简介。**

| 工具                                       | Wiki                                     | 简介                                       |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| [CustomView](https://github.com/GcsSloop/ViewSupport/blob/master/Library/src/main/java/com/gcssloop/view/CustomView.java) | [查看](https://github.com/GcsSloop/ViewSupport/wiki/CustomView) | 自定义View基类，帮助你节省部分代码                      |
| [CanvasAidUtils](https://github.com/GcsSloop/ViewSupport/blob/master/Library/src/main/java/com/gcssloop/view/utils/CanvasAidUtils.java) | [查看](https://github.com/GcsSloop/ViewSupport/wiki/CanvasAidUtils) | Canvas辅助工具，你可以用它绘制坐标系来帮助你检查视图的位置，并在完成之后移除该坐标系。 |
| [CanvasUtils](https://github.com/GcsSloop/ViewSupport/blob/master/Library/src/main/java/com/gcssloop/view/utils/CanvasUtils.java) | [查看](https://github.com/GcsSloop/ViewSupport/wiki/CanvasUtils) | Canvas绘图工具，封装了一些Canvas没有提供的方法，目前只能用来画一条线。 |
| [DensityUtils](https://github.com/GcsSloop/ViewSupport/blob/master/Library/src/main/java/com/gcssloop/view/utils/DensityUtils.java) | [查看](https://github.com/GcsSloop/ViewSupport/wiki/DensityUtils) | 密度工具， 根据设备进行如下单位转换: sp -> px, px -> sp, dp -> px, px -> dp |
| [MathUtils](https://github.com/GcsSloop/ViewSupport/blob/master/Library/src/main/java/com/gcssloop/view/utils/MathUtils.java) | [查看](https://github.com/GcsSloop/ViewSupport/wiki/MathUtils) | 数学工具， 封装一些数学算法，例如: 获取两点之间的距离，获取线段上某一点的位置， 获取线段与水平线夹角 等 |
| [ViewUtils](https://github.com/GcsSloop/ViewSupport/blob/master/Library/src/main/java/com/gcssloop/view/utils/ViewUtils.java) | [查看](https://github.com/GcsSloop/ViewSupport/wiki/ViewUtils) | 视图工具， 封装了一些与视图相关等内容，如 手动测量视图大小， 为视图动态设置margin 等 |
| [ApiHelper](https://github.com/GcsSloop/ViewSupport/blob/master/Library/src/main/java/com/gcssloop/view/helper/ApiHelper.java) | [查看](https://github.com/GcsSloop/ViewSupport/wiki/ApiHelper) | 版本检查工具，里面定义了很多与版本相关的常量，并且开放了几个检查方法，检查一个类(class)是否拥有某个字段或者某个方法。 |
| [MotionEventHelper](https://github.com/GcsSloop/ViewSupport/blob/master/Library/src/main/java/com/gcssloop/view/helper/MotionEventHelper.java) | [查看](https://github.com/GcsSloop/ViewSupport/wiki/MotionEventHelper) | MotionEvent 辅助类，帮助转换 MotionEvent 中的坐标系。   |

## 文档

* [点击这里查看文档](https://jitpack.io/com/github/GcsSloop/ViewSupport/v1.2.2/javadoc/)
* [点击这里查看Wiki](https://github.com/GcsSloop/ViewSupport/wiki)
* [点击这里查看更新日志](https://github.com/GcsSloop/ViewSupport/releases)

## 示例

[点击此处下载 Sample](https://github.com/GcsSloop/ViewSupport/raw/res/apk/Sample-ViewSupport.apk)

<img src="http://ww1.sinaimg.cn/large/006y8lVagw1fagg3b8rxyj31ay27djyc.jpg" width="300" />
<img src="http://ww4.sinaimg.cn/large/006y8lVagw1faggpir90tj31ay27dqa2.jpg" width="300" />

## 如何添加该开源库

#### Gradle:

**Step 1. 添加JitPack仓库**

在当前项目的根目录下的 `build.gradle` 文件中添加如下内容:

``` gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

**Step 2. 添加项目依赖**

``` gradle
dependencies {
        compile 'com.github.GcsSloop:ViewSupport:v1.3.0'
}
```

## About Me

### 微博: [@GcsSloop](http://weibo.com/GcsSloop)

<a href="https://github.com/GcsSloop/README/blob/master/README.md" target="_blank"> <img src="http://ww4.sinaimg.cn/large/005Xtdi2gw1f1qn89ihu3j315o0dwwjc.jpg" width="300" height="100" /> </a>

## License

```
Copyright (c) 2016 GcsSloop

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
