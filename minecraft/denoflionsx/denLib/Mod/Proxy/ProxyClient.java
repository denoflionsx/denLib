package denoflionsx.denLib.Mod.Proxy;

import java.io.File;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;

public class ProxyClient extends Proxy{

    @Override
    public String preloadTextures(String texture) {
        MinecraftForgeClient.preloadTexture(texture);
        return texture;
    }

    @Override
    public void sendMessageToPlayer(String msg) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(msg);
    }

    @Override
    public String getConfigDir() {
        return Minecraft.getMinecraftDir() + File.separator + "config" + File.separator + "denoflionsx" + File.separator;
    }

}
