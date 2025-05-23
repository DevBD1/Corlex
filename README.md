# Corlex

![corlex_foundation_api_banner](https://github.com/user-attachments/assets/cb8eb205-6922-4181-b8ea-735c47c9341d)

**The Modular API Foundation for Your Minecraft Plugin Ecosystem**
Corlex is a robust and extensible API plugin designed to serve as the shared core for your Minecraft plugin suite. It centralizes localization, logging, and more — enabling other plugins to integrate seamlessly.

---

## ✨ 🧪 Features

- 🌍 **Localization**: Supports YAML-based i18n with `{placeholders}`
- 🖥️ **Command System**: Modular subcommands via `/corlex`
- 🧾 **Logging**: Missing keys, fallback events, and in-game log viewing
- 🧱 **Config**: Defaults, server name, and more in `config.yml`

---

## 🧪 Example Usage

```java
CorlexAPI api = Bukkit.getServicesManager().load(CorlexAPI.class);
api.send(player, "corlex.welcome", Map.of("world", "Wilderness"));
```
Because corlex.welcome has {prefix}, {player} and {world} placeholders. First 2 is filled by the program, and the last one given by the call.
```
corlex:
  welcome: "{prefix}Welcome, {player}! You are in {world}."
```
---

## 🔧 Config Example

```yaml
# Enable/Disable logging (universal)
default-language: en
logging-enabled: true
server-name: Cublex

# Variables to be used in the language files
prefix: "#ffc13b[Corlex] &r"
test-prefix: "&6[TEST] &r"
discord: "https://discord.gg/cublex" # Chat and announcements but inactive in Turkey
telegram: "https://t.me/mcublex" # Announcements and replies
```

---

## 📦 Roadmap

- GUI API (paged layouts, close/back buttons, border styles)
- Per-player language preferences
- Auto-merging of locale files on update
- Plugin usage metrics
- Announcement API (Game, Discord)
- Use arguments for permission error message. Interaction or command error
- Format commands help into clickable TextComponents
- Paginate the output of help command if you add more commands
- Auto-suggest when the user types an invalid command
- Add force-default-language boolean

---

## 📣 Need Help?

This plugin is designed to be extended by other plugins. If you’re building something with Corlex, open an issue or contact the developer for help or contributions.

---

> Build smarter. Standardize everything. Use Corlex.

NOTES ON GUI MODULE:
1- if 6 lines, have a border in slots [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45, 46, 47, 48, 50, 51, 52, 53]
2- if 6 lines and multi page, have a border, and slots 50, 49 and 48 are for Previous page, Close this page, Next page buttons.
3- if 6 lines and single page, slot 49 is Close this page button
4- if 5, 4 or 2 lines ERROR
5- if 3 lines, have option to have border or not. single page or multi page. slots 23, 22, 21 are buttons.
6- if single line and single page, no border, all 9 slots are custom

Auto Spawn, Spawn teleport
folder-level README templates or documentation boilerplate?


