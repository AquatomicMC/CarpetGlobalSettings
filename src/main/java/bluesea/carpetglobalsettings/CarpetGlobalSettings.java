package bluesea.carpetglobalsettings;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarpetGlobalSettings implements ModInitializer {
    private final Logger LOG = LoggerFactory.getLogger("CarpetGlobalSettings");

    @Override
    public void onInitialize() {
        LOG.info("Initialized CarpetGlobalSettings");
    }
}
