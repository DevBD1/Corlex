/**
 * This class gets and returns Player's Locale, and returns the Default Locale if it catches an error.
 * The check is in the list of supported locales in another program.
 */
package io.github.devbd1.cublexcore.utilities;

import org.bukkit.entity.Player;

public class LocaleGetter {

    public static String getPlayerLocale(Player player) {
        try {
            return player.locale().getLanguage().toLowerCase();
        } catch (Exception e) {
            return getDefaultLocale();
        }
    }

    public static String getDefaultLocale() {

        return ConfigManager.getString("fallback-language", "en").toLowerCase();
    }
}
