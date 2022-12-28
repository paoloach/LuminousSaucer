import { createSlice } from '@reduxjs/toolkit'
import type { PayloadAction } from '@reduxjs/toolkit'
import { RootState } from '../../store'
import { EspHomeDevice } from '../../objects/EspHomeDevice'


export interface ZeroconfState {
  devices: EspHomeDevice[]
}

const initialState: ZeroconfState = {
    devices: [],
}

export const zeroconfSlice = createSlice({
  name: 'zeroconf',
  initialState,
  reducers: {
    addDevice: (state, action: PayloadAction<EspHomeDevice>) => {
      const found = state.devices.find( (device) => {
        if (device.host == action.payload.host)
          return true;
        else
          return false;
      })

      if (found){
        return;
      }

      if (!action.payload.name.startsWith("sottovasoluminoso"))
        return;


      state.devices = [... state.devices]
      state.devices.push(action.payload)
    },
  },
})


export const selectDevices = (state:RootState) => state.zeroconf.devices

export const { addDevice} = zeroconfSlice.actions

export default zeroconfSlice.reducer