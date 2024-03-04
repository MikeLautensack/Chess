import { Button, Stack, TextField } from "@mui/material";
import React from "react";
import { useForm } from "react-hook-form";

const SignIn = () => {

  const { 
    register,
    formState: { errors },
    handleSubmit
  } = useForm<SignInFormData>({
      
  });

  const onSubmit = (data: SignInFormData) => {

  }

  return (
    <>
      <form onSubmit={handleSubmit(onSubmit)}>
        <Stack>
          <TextField 
            label="Username"
            type="text"
            {...register("username", { required: "Username is required"})}
            error={!!errors.username}
            helperText={errors.username?.message}
          />
          <TextField 
            label="Password"
            type="text"
            {...register("password", { required: "Password is required"})}
            error={!!errors.password}
            helperText={errors.password?.message}
          />
          <Button>
            Sign In
          </Button>
        </Stack>
      </form>
    </>
  );
}

export default SignIn;