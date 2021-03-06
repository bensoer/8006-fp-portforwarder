package lib.net.rw

import lib.net.rw.IReadWritableChannel
import java.net.InetSocketAddress
import java.nio.ByteBuffer
import java.nio.channels.SocketChannel

/**
 * Created by bensoer on 14/03/16.
 */

class ReadWriteableSocketChannel(private val socketChannel: SocketChannel): IReadWritableChannel {


    override fun read(buffer: ByteBuffer): Int {
        return socketChannel.read(buffer);
    }

    override fun write(buffer: ByteBuffer) {
        socketChannel.write(buffer);
    }

    override fun isDatagram():Boolean {
        return false;
    }

    override fun getSourceAddress(): InetSocketAddress?{
        return this.socketChannel.remoteAddress as InetSocketAddress;
    }


}