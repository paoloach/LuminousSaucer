
export interface EspHomeDevice {
    host:string
    fullname:string
    port:number
    name:string
    platform:string
    version:string
    board:string
    mac:string
    address:string
}


export const createEspHomeDevice = (service:any):EspHomeDevice => {
        return { 
            host: service.host,
            fullname: service.fullName,
            port: service.port,
            name: service.name,
            platform: service.txt.platform,
            version: service.txt.version,
            board: service.txt.board,
            mac: service.txt.mac,
            address: service.txt.address
    }
}

