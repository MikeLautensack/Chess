"use client";

import React from "react";
import { Box, TextField, InputLabel, Button } from "@mui/material";
import { useForm, Controller, SubmitHandler } from "react-hook-form";
import { zodResolver } from "@hookform/resolvers/zod";
import { z } from "zod";
import { signIn } from "next-auth/react";

const SignInFormSchema = z.object({
  gmail: z.string(),
});

type SignInFormValues = z.infer<typeof SignInFormSchema>;

const SignInForm = () => {
  const {
    handleSubmit,
    control,
    formState: { errors },
  } = useForm<SignInFormValues>({
    resolver: zodResolver(SignInFormSchema),
    defaultValues: { gmail: "" },
  });

  return (
    <form
      onSubmit={handleSubmit(() =>
        signIn("google", { callbackUrl: "http://localhost:3000/dashboard" })
      )}
    >
      <Box>
        <InputLabel>Gmail</InputLabel>
        <Controller
          name="gmail"
          control={control}
          render={({ field }) => (
            <TextField
              {...field}
              label="gmail"
              error={!!errors.gmail}
              helperText={errors.gmail?.message as React.ReactNode}
            />
          )}
        />
        <Button type="submit">Login with Gamil</Button>
      </Box>
    </form>
  );
};

export default SignInForm;
