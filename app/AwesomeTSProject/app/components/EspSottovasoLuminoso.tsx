import React from "react";
import { EspHomeDevice } from "../objects/EspHomeDevice";
import { Text, Stack } from "@react-native-material/core";


export type EspSottovasoLuminosoProps = {
    espComponent: EspHomeDevice
} 


export const EspSottovasoLuminoso = (props: EspSottovasoLuminosoProps)=> {
    return (
        <Text variant="h5">
            {props.espComponent.host}
        </Text>
        )
}