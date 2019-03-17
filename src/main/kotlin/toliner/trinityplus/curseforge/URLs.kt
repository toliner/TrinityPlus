package toliner.trinityplus.curseforge

object URLs {
    const val MINECRAFT_INSTALLER_WIN = "https://launcher.mojang.com/download/Minecraft.exe"
    const val FORGE_INSTALLER_JAR = "https://files.minecraftforge.net/maven/net/minecraftforge/forge/\${forge_version}/forge-\${forge_version}-installer.jar"
    const val API_CATEGORY_LIST = "https://addons-ecs.forgesvc.net/api/category/section/\${number}"
    const val API_ADDON_INFO_LIST = "https://addons-ecs.forgesvc.net/api/addon"
    const val API_MINECRAFT_VERSION_LIST = "https://addons-ecs.forgesvc.net/api/minecraft/version"
    const val API_FORGE_VERSINO_LIST = "https://addons-ecs.forgesvc.net/api/minecraft/modloader?version=\${mc_version}"
    const val API_SEARCH = "https://addons-ecs.forgesvc.net/api/addon/search?categoryId\${category_id}&gameId=432&gameVersion=\${mc_version}&index=\${index}&pageSize=\${page_size}&searchFilter=\${search_query}&sectionId=\${section_id}&sort=\${sort}"
    const val API_ADDON_INFO = "https://addons-ecs.forgesvc.net/api/addon/\${addon_id}"
    const val API_ADDON_INFO_FILES = "https://addons-ecs.forgesvc.net/api/addon/\${addon_id}/files"
    const val API_ADDON_INFO_CHANGELOG = "https://addons-ecs.forgesvc.net/api/addon/\${addon_id}/changelog"
}
