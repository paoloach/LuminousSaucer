/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * Generated with the TypeScript template
 * https://github.com/react-native-community/react-native-template-typescript
 *
 * @format
 */

import React, { useEffect} from 'react';
import {  SafeAreaView,  ScrollView,  Text,  useColorScheme,  View,} from 'react-native';

import { Colors,  Header} from 'react-native/Libraries/NewAppScreen';
import Zeroconf from 'react-native-zeroconf'
import { addDevice, selectDevices } from './features/zeroconf/zeroconf';
import { useAppSelector, useAppDispatch } from './hooks';
import { EspHomeDevice, createEspHomeDevice } from './objects/EspHomeDevice';
import { EspSottovasoLuminoso } from './components/EspSottovasoLuminoso';
import { VStack } from '@react-native-material/core'



const zeroconf = new Zeroconf()


const App = () => {
  const isDarkMode = useColorScheme() === 'dark';
  const dispatch = useAppDispatch()

  const devices = useAppSelector(selectDevices)

  useEffect( () => {

  },[devices])

  const backgroundStyle = {
    backgroundColor: isDarkMode ? Colors.darker : Colors.lighter,
  };

  zeroconf.on('start', () => {
    console.log('[Start]')
  })

  zeroconf.on('stop', () => {
    console.log('[Stop]')
  })

  zeroconf.on('resolved', service => {
    console.log('[Resolve]', JSON.stringify(service, null, 2));
    let newDevice:EspHomeDevice = createEspHomeDevice(service)
    dispatch(addDevice(newDevice))
  });

  zeroconf.on('error', err => {
    console.log('[Error]', err)
  })

  zeroconf.scan('esphomelib', 'tcp', 'local.')




  return (
    <SafeAreaView style={backgroundStyle}>

      <ScrollView
        contentInsetAdjustmentBehavior="automatic"
        style={backgroundStyle}>
        <View
          style={{
            backgroundColor: isDarkMode ? Colors.black : Colors.white,
          }}>

          <VStack m={10} spacing={10} shouldWrapChildren={true} >
            {devices.map( (device) => (
              <EspSottovasoLuminoso espComponent={device}  />
            ))}
          </VStack>
        </View>
      </ScrollView>
    </SafeAreaView>
  );
};


export default App;
