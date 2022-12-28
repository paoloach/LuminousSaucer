import { store } from './store'
import { Provider } from 'react-redux'
import App  from './App'


export const StoreProvider = () => {
    return (
    <Provider store={store}>
        <App />
    </Provider>
    );
}
