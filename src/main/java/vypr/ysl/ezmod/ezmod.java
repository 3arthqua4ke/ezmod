package vypr.ysl.ezmod;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
@Mod(
        modid = ezmod.EZMOD,
        name = ezmod.EZMOD,
        version = ezmod.VERSION,
        acceptedMinecraftVersions = "[1.12.2]",
        clientSideOnly = true
)
public class ezmod {
    public static final String EZMOD = "ezmod";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance(owner = EZMOD)
    public static ezmod instance;

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ezmod());
    }

    @SubscribeEvent
    public void onSendMessage(ClientChatEvent event) {
        event.setMessage(event.getMessage().replace("ez", "e z"));
    }
}