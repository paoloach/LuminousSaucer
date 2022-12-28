import { configureStore } from '@reduxjs/toolkit'
import zeroconf from './features/zeroconf/zeroconf'
import zeroconfReducer from './features/zeroconf/zeroconf'

export const store = configureStore({
  reducer: {
    zeroconf: zeroconfReducer
  },
})

// Infer the `RootState` and `AppDispatch` types from the store itself
export type RootState = ReturnType<typeof store.getState>
// Inferred type: {posts: PostsState, comments: CommentsState, users: UsersState}
export type AppDispatch = typeof store.dispatch