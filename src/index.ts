import fastify from 'fastify'
import prismaPlugin from './plugins/prisma'

export const server = fastify({
  logger: true,
})

server.register(prismaPlugin);

server.get('/ping', async (request, reply) => {
  return 'pong\n'
})

server.get('/testdb',async (request, reply) => {
  const users = await server.prisma.user.findMany();
  return users;
})

server.listen(8080, (err, address) => {
  if (err) {
    console.error(err)
    process.exit(1)
  }
  console.log(`Server listening at ${address}`)
})