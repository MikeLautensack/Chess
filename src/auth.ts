import NextAuth from "next-auth";
import Google from "next-auth/providers/google";
export const { auth, handlers, signIn, signOut } = NextAuth({
  // session: {
  //   strategy: "jwt",
  // },
  providers: [
    Google({
      clientId: process.env.NEXT_PUBLIC_AUTH_GOOGLE_ID,
      clientSecret: process.env.NEXT_PUBLIC_AUTH_GOOGLE_SECRET,
    }),
  ],
  callbacks: {
    // async signIn({account, profile}) {
    // }
  },
});
