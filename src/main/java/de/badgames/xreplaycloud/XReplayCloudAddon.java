package de.badgames.xreplaycloud;

import de.badgames.cloudhelper.CloudHelper;
import org.bukkit.plugin.java.JavaPlugin;
import de.musterbukkit.replaysystem.main.ReplayAPI;

public class XReplayCloudAddon extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        CloudHelper.init();
        ReplayAPI.setReplayName(CloudHelper.getCloudHandler().getServerName());
        CloudHelper.getCloudHandler().setProperty("replayId", ReplayAPI.getReplayID());
    }
}
