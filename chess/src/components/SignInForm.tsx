import React from "react";
import { Box, TextField, InputLabel, Button } from "@mui/material";
import { useForm, Controller, SubmitHandler } from "react-hook-form";
import { zodResolver } from "@hookform/resolvers/zod";
import { z } from "zod";

const SignInFormSchema = z.object({
  input: z.string(),
});

type SignInFormValues = z.infer<typeof SignInFormSchema>;

const SignInForm = () => {
  const {
    handleSubmit,
    control,
    formState: { errors },
  } = useForm<SignInFormValues>({
    resolver: zodResolver(SignInFormSchema),
    defaultValues: { input: "" },
  });

  const onSubmit: SubmitHandler<SignInFormValues> = (
    formData: SignInFormValues
  ) => {
    console.log(formData);
  };

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
      <Box>
        <InputLabel>Input</InputLabel>
        <Controller
          name="input"
          control={control}
          render={({ field }) => (
            <TextField
              {...field}
              label="input"
              error={!!errors.input}
              helperText={errors.input?.message as React.ReactNode}
            />
          )}
        />
        <Button type="submit">Submit</Button>
      </Box>
    </form>
  );
};

export default SignInForm;
