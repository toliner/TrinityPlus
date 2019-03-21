# TrinityPlus
**Minecraft Forgeプレーヤーのためのランチャー**  
かつて、MinecraftのMod環境のプロファイラー/ランチャーは、FTB Launcher、及びその後継のCurseAppが存在した。  
しかし、Curse Inc.がTwitchに買収され、CurseAppはTwitch DesktopAppとなり、Twitchに関する機能が多数付与された。  
それと共に、アプリケーションとしての安定性は失い、MinecraftのModプロファイラー/ランチャーとしては明らかに劣化してしまった。  
これは、そんな状況を改善するための、**Minecrafft専用のMod環境構築/ランチツール**である。  
  
# 使用方法
WIP

# ビルド方法
## 必要な環境
- Windows
- Minecraftが動く程度の性能
- インターネット接続
- JavaFXのインストール/バンドルされたJDK8

## 方法

1. コマンドプロンプトで、以下のコマンドを実行する。
```cmd
git clone https://github.com/toliner/TrinityPlus.git
cd TrinityPlus
gradlew distZip
```
2. build/distributionsにあるzipを好きなところに解凍する
3. 解凍されて出てきたフォルダ中の、binフォルダ内のTrinity+.batを起動する
4. 何事も無ければ、無事アプリケーションが起動します！
