'use client'

import React from 'react'
import Button from './Button'
import { useForm, SubmitHandler } from "react-hook-form"
import { Inputs, SearchProps } from '../types/searchtypes'

const Search = ({ inputStyles, buttonStyles, onSearch }: SearchProps) => {

  const {
      register,
      handleSubmit,
  } = useForm<Inputs>()

  const onSubmit: SubmitHandler<Inputs> = (data) => {
    onSearch(data)
  }

  return (
    <form onSubmit={handleSubmit(onSubmit)}>
        <input className={inputStyles} {...register("search")}></input>
        <Button
            className={buttonStyles}
        >
            Search
        </Button>
    </form>
  )
}

export default Search