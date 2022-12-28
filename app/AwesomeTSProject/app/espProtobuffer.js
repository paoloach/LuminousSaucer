
import esphome from '../esphome_pb';


export const hello = () => {
    const hello = new esphome.HelloRequest();

    hello.setClientInfo("SottovasoLuminoso")
    hello.setApiVersionMajor(1)
    hello.setApiVersionMinor(1)

    const serializedData = hello.serializeBinary();
}


