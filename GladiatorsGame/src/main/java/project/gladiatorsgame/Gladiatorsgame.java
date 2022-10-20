package project.gladiatorsgame;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;

public final class Gladiatorsgame extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GladiatorsMechanic(this), this);
        getCommand("start").setExecutor(new Commands(this));

        WorldCreator gladiatorsWorld = new WorldCreator("GladiatorsWorld");
        gladiatorsWorld.type(WorldType.FLAT);
        gladiatorsWorld.generatorSettings("2;0;1;");
        gladiatorsWorld.createWorld();

    }
}
