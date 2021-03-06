package com.gk.server.mqtt.msg;

import java.io.IOException;
import java.io.OutputStream;

public class MessageOutputStream
{

    private final OutputStream out;

    public MessageOutputStream(OutputStream out)
    {
        this.out = out;
    }

    public void writeMessage(Message msg)
            throws IOException
    {
        msg.write(out);
        out.flush();
    }

}
